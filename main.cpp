#include "window.h"
#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    Window w;
    w.show();
    w.setFixedSize(1500, 1000);

    return a.exec();
}
