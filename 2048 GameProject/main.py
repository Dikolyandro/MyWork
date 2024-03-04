import json
import sys
import pygame
from pygame.locals import * #Provides constants like QUIT, KEYDOWN, etc., used in Pygame.

from game import playGame #a function to start the main game loop.

WHITE = (255, 255, 255)
BLACK = (0, 0, 0)

#representing RGB colors used in the game

pygame.mixer.music.load('bgmusic.mp3')  # Replace 'background_music.mp3' with the path to your music file

pygame.mixer.music.play(-1)  # The -1 parameter will loop the music indefinitely


class Button():
    """
    Class to create a new button in pygame window.
    """

    # initialise the button
    def __init__(self, colour, x, y, width, height, text=""):
        self.colour = colour
        self.x = x
        self.y = y
        self.width = width
        self.height = height
        self.text = text

    # draw the button on the screen
    def draw(self, win, text_col, font):
        drawRoundRect(win, self.colour, (self.x, self.y,
                                         self.width, self.height))

        if self.text != "":
            text = font.render(self.text, 1, text_col)
            win.blit(text, (self.x + (self.width / 2 - text.get_width() / 2),
                            self.y + (self.height / 2 - text.get_height() / 2)))

    #Если кнопка имеет текст (self.text не пустая строка), она отображает текст, используя предоставленный шрифт (font) и цвет текста (text_col).
    #Он вычисляет позицию для блайта (отображения) текста в центре кнопки, корректируя ее на основе размеров кнопки и размеров текста.

    # check if the mouse is positioned over the button
    def isOver(self, pos):
        # pos is the mouse position or a tuple of (x,y) coordinates
        if pos[0] > self.x and pos[0] < self.x + self.width:
            if pos[1] > self.y and pos[1] < self.y + self.height:
                return True

        return False


def drawRoundRect(surface, colour, rect, radius=0.4): #Поверхность Pygame, на которой будет нарисован закругленный прямоугольник.
    """
    Draw an antialiased rounded filled rectangle on screen

    Parameters:
        surface (pygame.Surface): destination
        colour (tuple): RGB values for rectangle fill colour
        radius (float): 0 <= radius <= 1
    """

    rect = Rect(rect) #кортеж, представляющий положение и размер прямоугольника в формате `(x, y, width, height)`.
    colour = Color(*colour)
    alpha = colour.a  #Сохраняет альфа-значение цвета для последующего использования.
    colour.a = 0 #Временно устанавливает альфа-значение цвета в 0.
    pos = rect.topleft
    rect.topleft = 0, 0
    rectangle = pygame.Surface(rect.size, SRCALPHA)

    circle = pygame.Surface([min(rect.size) * 3] * 2, SRCALPHA)
    #Эта строка создает новую поверхность Pygame (`circle`) с размерами, в три раза превышающими минимальный размер
    #заданного прямоугольника (`rect`). Флаг `SRCALPHA` указывает на то, что поверхность будет поддерживать попиксельную прозрачность.

    pygame.draw.ellipse(circle, BLACK, circle.get_rect(), 0) #Эта строка рисует эллипс на поверхности `circle`.
    circle = pygame.transform.smoothscale( #Эта строка сглаживает поверхность `circle` до соответствующего размера, основанного на указанном радиусе.
        circle, [int(min(rect.size) * radius)] * 2)
    #Коэффициент масштабирования вычисляется путем умножения минимального размера прямоугольника (`min(rect.size)`) на радиус.
    #Используется в обоих измерениях, поэтому умножается на 2

    radius = rectangle.blit(circle, (0, 0))
    radius.bottomright = rect.bottomright
    rectangle.blit(circle, radius)
    radius.topright = rect.topright
    rectangle.blit(circle, radius)
    radius.bottomleft = rect.bottomleft
    rectangle.blit(circle, radius)

    rectangle.fill(BLACK, rect.inflate(-radius.w, 0))
    rectangle.fill(BLACK, rect.inflate(0, -radius.h))

    rectangle.fill(colour, special_flags=BLEND_RGBA_MAX)
    rectangle.fill((255, 255, 255, alpha), special_flags=BLEND_RGBA_MIN)

    surface.blit(rectangle, pos)


def showMenu():
    """
    Display the start screen
    """
    # create light theme button
    light_theme = Button(
        tuple(c["colour"]["light"]["2048"]), 200 - 70, 275, 45, 45, "light")
    # create dark theme button
    dark_theme = Button(
        tuple(c["colour"]["dark"]["2048"]), 270 - 70, 275, 45, 45, "dark")

    # initialise theme
    theme = ""
    theme_selected = False

    # create difficulty buttons
    _2048 = Button(tuple(c["colour"]["light"]["64"]),
                   130, 330, 70, 50, "extreme")
    _1024 = Button(tuple(c["colour"]["light"]["2048"]),
                   210, 330, 50, 50, "hard")
    _512 = Button(tuple(c["colour"]["light"]["2048"]),
                  270, 330, 70, 50, "medium")
    _256 = Button(tuple(c["colour"]["light"]["2048"]),
                  350, 330, 50, 50, "easy")

    # default difficulty
    difficulty = 0
    diff_selected = False

    # create play button
    play = Button(tuple(c["colour"]["light"]["2048"]),
                  235, 400, 45, 45, "GO!")

    # pygame loop for start screen
    while True:
        screen.fill(BLACK)

        screen.blit(pygame.transform.scale(
            pygame.image.load("images/icon.ico"), (200, 200)), (155, 50))

        font = pygame.font.SysFont(c["font"], 15, bold=True)

        theme_text = font.render("Theme: ", 1, WHITE)
        screen.blit(theme_text, (55, 285))

        diff_text = font.render("Difficulty: ", 1, WHITE)
        screen.blit(diff_text, (40, 345))

        # set fonts for buttons
        font1 = pygame.font.SysFont(c["font"], 15, bold=True)
        font2 = pygame.font.SysFont(c["font"], 14, bold=True)

        # draw all buttons on the screen
        light_theme.draw(screen, WHITE, font1)
        dark_theme.draw(screen, (197, 255, 215), font1)
        _2048.draw(screen, WHITE, font2)
        _1024.draw(screen, WHITE, font2)
        _512.draw(screen, WHITE, font2)
        _256.draw(screen, WHITE, font2)
        play.draw(screen, WHITE, font1)

        pygame.display.update()

        for event in pygame.event.get():
            # store mouse position (coordinates)
            pos = pygame.mouse.get_pos() #Получает текущее положение указателя мыши на экране. Возвращает координаты (x, y) в виде кортежа.

            if event.type == QUIT or \
                    (event.type == pygame.KEYDOWN and event.key == K_q):
                # exit if q is pressed
                # Этот условный оператор проверяет, является ли тип события событием выхода из игры (`QUIT`) или если
                # нажата клавиша вниз (`KEYDOWN`) и если эта клавиша - 'q' (`K_q`).

                pygame.quit()
                sys.exit()

            # check if a button is clicked
            if event.type == pygame.MOUSEBUTTONDOWN:
                # select light theme
                if light_theme.isOver(pos):
                    dark_theme.colour = tuple(c["colour"]["dark"]["2048"])
                    light_theme.colour = tuple(c["colour"]["light"]["64"])
                    theme = "light"
                    theme_selected = True

                # select dark theme
                if dark_theme.isOver(pos):
                    dark_theme.colour = tuple(c["colour"]["dark"]["background"])
                    light_theme.colour = tuple(c["colour"]["light"]["2048"])
                    theme = "dark"
                    theme_selected = True

                if _2048.isOver(pos):
                    _2048.colour = tuple(c["colour"]["light"]["64"])
                    _1024.colour = tuple(c["colour"]["light"]["2048"])
                    _512.colour = tuple(c["colour"]["light"]["2048"])
                    _256.colour = tuple(c["colour"]["light"]["2048"])
                    difficulty = 2048
                    diff_selected = True

                if _1024.isOver(pos):
                    _1024.colour = tuple(c["colour"]["light"]["64"])
                    _2048.colour = tuple(c["colour"]["light"]["2048"])
                    _512.colour = tuple(c["colour"]["light"]["2048"])
                    _256.colour = tuple(c["colour"]["light"]["2048"])
                    difficulty = 1024
                    diff_selected = True

                if _512.isOver(pos):
                    _512.colour = tuple(c["colour"]["light"]["64"])
                    _1024.colour = tuple(c["colour"]["light"]["2048"])
                    _2048.colour = tuple(c["colour"]["light"]["2048"])
                    _256.colour = tuple(c["colour"]["light"]["2048"])
                    difficulty = 512
                    diff_selected = True

                if _256.isOver(pos):
                    _256.colour = tuple(c["colour"]["light"]["64"])
                    _1024.colour = tuple(c["colour"]["light"]["2048"])
                    _512.colour = tuple(c["colour"]["light"]["2048"])
                    _2048.colour = tuple(c["colour"]["light"]["2048"])
                    difficulty = 256
                    diff_selected = True

                # play game with selected theme
                if play.isOver(pos):
                    if theme != "" and difficulty != 0:
                        playGame(theme, difficulty)

                # reset theme & diff choice if area outside buttons is clicked
                if not play.isOver(pos) and \
                        not dark_theme.isOver(pos) and \
                        not light_theme.isOver(pos) and \
                        not _2048.isOver(pos) and \
                        not _1024.isOver(pos) and \
                        not _512.isOver(pos) and \
                        not _256.isOver(pos):
                    theme = ""
                    theme_selected = False
                    diff_selected = False

                    light_theme.colour = tuple(c["colour"]["light"]["2048"])
                    dark_theme.colour = tuple(c["colour"]["dark"]["2048"])
                    _2048.colour = tuple(c["colour"]["light"]["2048"])
                    _1024.colour = tuple(c["colour"]["light"]["2048"])
                    _512.colour = tuple(c["colour"]["light"]["2048"])
                    _256.colour = tuple(c["colour"]["light"]["2048"])

            # change colour on hovering over buttons
            if event.type == pygame.MOUSEMOTION:
                if not theme_selected:
                    if light_theme.isOver(pos):
                        light_theme.colour = tuple(c["colour"]["light"]["64"])
                    else:
                        light_theme.colour = tuple(c["colour"]["light"]["2048"])

                    if dark_theme.isOver(pos):
                        dark_theme.colour = tuple(c["colour"]["dark"]["background"])
                    else:
                        dark_theme.colour = tuple(c["colour"]["dark"]["2048"])

                if not diff_selected:
                    if _2048.isOver(pos):
                        _2048.colour = tuple(c["colour"]["light"]["64"])
                    else:
                        _2048.colour = tuple(c["colour"]["light"]["2048"])

                    if _1024.isOver(pos):
                        _1024.colour = tuple(c["colour"]["light"]["64"])
                    else:
                        _1024.colour = tuple(c["colour"]["light"]["2048"])

                    if _512.isOver(pos):
                        _512.colour = tuple(c["colour"]["light"]["64"])
                    else:
                        _512.colour = tuple(c["colour"]["light"]["2048"])

                    if _256.isOver(pos):
                        _256.colour = tuple(c["colour"]["light"]["64"])
                    else:
                        _256.colour = tuple(c["colour"]["light"]["2048"])

                if play.isOver(pos):
                    play.colour = tuple(c["colour"]["light"]["64"])
                else:
                    play.colour = tuple(c["colour"]["light"]["2048"])


if __name__ == "__main__":
    # load json data
    c = json.load(open("constants.json", "r"))

    # set up pygame
    pygame.init()
    # set up screen

    screen = pygame.display.set_mode(
        (c["size"], c["size"]))
    pygame.display.set_caption("2048 by Damir Syzdykov")

    # display game icon in window
    icon = pygame.transform.scale(
        pygame.image.load("images/icon.ico"), (32, 32))
    pygame.display.set_icon(icon)

    # set font according to json data specifications
    my_font = pygame.font.SysFont(c["font"], c["font_size"], bold=True)

    # display the start screen
    showMenu()