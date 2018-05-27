#include "widget.h"
#include "window.h"

Window::Window(QWidget *parent)
    : QWidget(parent)
{
    setWindowTitle(tr("Mandelbrot set"));

    Widget *native = new Widget(this);
}
