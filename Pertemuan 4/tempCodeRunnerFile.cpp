#include <GL/glut.h>

float angle = 0.0;

void display() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();

    glTranslatef(0.0f, 0.0f, -5.0f);
    glRotatef(angle, 1.0f, 1.0f, 0.0f);

    glBegin(GL_QUADS);

    // depan
    glColor3f(1,0,0);
    glVertex3f(-1,1,1);
    glVertex3f(1,1,1);
    glVertex3f(1,-1,1);
    glVertex3f(-1,-1,1);

    // belakang
    glColor3f(0,1,0);
    glVertex3f(-1,1,-1);
    glVertex3f(1,1,-1);
    glVertex3f(1,-1,-1);
    glVertex3f(-1,-1,-1);

    // kiri
    glColor3f(0,0,1);
    glVertex3f(-1,1,1);
    glVertex3f(-1,1,-1);
    glVertex3f(-1,-1,-1);
    glVertex3f(-1,-1,1);

    // kanan
    glColor3f(1,1,0);
    glVertex3f(1,1,1);
    glVertex3f(1,1,-1);
    glVertex3f(1,-1,-1);
    glVertex3f(1,-1,1);

    // atas
    glColor3f(1,0,1);
    glVertex3f(-1,1,1);
    glVertex3f(1,1,1);
    glVertex3f(1,1,-1);
    glVertex3f(-1,1,-1);

    // bawah
    glColor3f(0,1,1);
    glVertex3f(-1,-1,1);
    glVertex3f(1,-1,1);
    glVertex3f(1,-1,-1);
    glVertex3f(-1,-1,-1);

    glEnd();

    glutSwapBuffers();
}

void idle() {
    angle += 0.2;
    glutPostRedisplay();
}

void init() {
    glEnable(GL_DEPTH_TEST);
}

int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
    glutInitWindowSize(600,600);
    glutCreateWindow("Tes OpenGL 3D");

    init();
    glutDisplayFunc(display);
    glutIdleFunc(idle);

    glutMainLoop();
}