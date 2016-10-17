int a,b,x,y,u,v;
a = 48;
b = 36;
x = Math.abs(a); y = Math.abs(b);
u = Math.abs(a); v = Math.abs(b);

while (x>y || y>x) {
    if (x>y) {
        x = x - y; u = u + v;
    }
    else if (y>x) {
        y = y - x; v = v + u; 
    }
}
