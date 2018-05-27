#include "widget.h"
#include <QPainter>

Widget::Widget(QWidget *parent)
    : QWidget(parent)
{
    setFixedSize(1500, 1000);
}

void Widget::paintEvent(QPaintEvent *event)
{
    QPainter p;
    p.begin(this);
    p.translate(1000, 500);
    p.scale(1, -1);

    int i = 0;
    int x = 0;
    int y = 0;
    double rx = 0;
    double ry = 0;
    double cx = 0;
    double cy = 0;
    double newrx = 0;
    for (x = -1000; x <= 500; x++)
        for (y = 500; y >= -500; y--)
        {
            cx = x * 0.002;
            cy = y * 0.002;
            rx = 0.0;
            ry = 0.0;
            for (i = 0; i < 200; i++)
            {
                newrx = rx * rx - ry * ry + cx;
                ry = 2 * rx * ry + cy;
                rx = newrx;
                if ((rx * rx + ry * ry) >= 4)
                    break;
            }
            if (i == 200)
                p.drawPoint(x, y);
        }
    p.end();
}
