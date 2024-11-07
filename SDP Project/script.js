// Singleton Pattern: Ensures a single instance of the QuizState
const QuizState = (() => {
    let instance;

    function createInstance() {
        return {
            currentQuestionIndex: 0,
            score: 0,
        };
    }

    return {
        getInstance: () => {
            if (!instance) {
                instance = createInstance();
            }
            return instance;
        },
    };
})();

// Factory Method Pattern: Creates question objects
class QuestionFactory {
    static createQuestion(text, options, correctAnswer) {
        return { text, options, correctAnswer };
    }
}

// Builder Pattern: Constructs the quiz with questions
class QuizBuilder {
    constructor() {
        this.questions = [];
    }

    addQuestion(text, options, correctAnswer) {
        const question = QuestionFactory.createQuestion(text, options, correctAnswer);
        this.questions.push(question);
        return this;
    }

    build() {
        return this.questions;
    }
}

// Adapter Pattern: Adapts question data to the required format
class QuestionAdapter {
    constructor(question) {
        this.question = question;
    }

    getFormattedQuestion() {
        return {
            text: this.question.text,
            options: this.question.options,
            correctAnswer: this.question.correctAnswer,
        };
    }
}

// Decorator Pattern: Adds functionality to display elements
class DisplayDecorator {
    constructor(element) {
        this.element = element;
    }

    show() {
        this.element.classList.remove('hidden');
    }

    hide() {
        this.element.classList.add('hidden');
    }
}

// Observer Pattern: Manages event listeners
class EventObserver {
    constructor() {
        this.observers = [];
    }

    subscribe(fn) {
        this.observers.push(fn);
    }

    unsubscribe(fn) {
        this.observers = this.observers.filter(subscriber => subscriber !== fn);
    }

    broadcast(data) {
        this.observers.forEach(subscriber => subscriber(data));
    }
}

// Strategy Pattern: Defines different scoring strategies
class ScoringStrategy {
    calculateScore(currentScore) {
        return currentScore;
    }
}

class CorrectAnswerStrategy extends ScoringStrategy {
    calculateScore(currentScore) {
        return currentScore + 1;
    }
}

// Main Quiz Module
const QuizModule = (() => {
    const state = QuizState.getInstance();
    const questionContainer = document.getElementById('question-container');
    const questionElement = document.getElementById('question');
    const optionsElement = document.getElementById('options');
    const nextButton = document.getElementById('next-button');
    const resultContainer = new DisplayDecorator(document.getElementById('result-container'));
    const resultElement = document.getElementById('result');
    const restartButton = document.getElementById('restart-button');
    const nextQuestionObserver = new EventObserver();
    const scoringStrategy = new CorrectAnswerStrategy();

    const quizBuilder = new QuizBuilder();
    quizBuilder
        .addQuestion('В каком году состоялся первый чемпионат мира по футболу?', ['1928', '1930', '1932', '1934'], 1)
        .addQuestion('Какая страна выиграла чемпионат мира по футболу в 2018 году?', ['Германия', 'Бразилия', 'Франция', 'Аргентина'], 2)
        .addQuestion('Кто является лучшим бомбардиром в истории Лиги чемпионов УЕФА?', ['Лионель Месси', 'Криштиану Роналду', 'Роберт Левандовски', 'Карим Бензема'], 1)
        .addQuestion('Какой клуб имеет наибольшее количество побед в Лиге чемпионов УЕФА?', ['Барселона', 'Милан', 'Реал Мадрид', 'Ливерпуль'], 2)
        .addQuestion('Кто получил "Золотой мяч" в 2023 году?', ['Лионель Месси', 'Криштиану Роналду', 'Роберт Левандовски', 'Карим Бензема'], 0)
        .addQuestion('В каком клубе начал свою профессиональную карьеру Диего Марадона?', ['Бока Хуниорс', 'Барселона', 'Наполи', 'Аргентинос Хуниорс'], 3)
})