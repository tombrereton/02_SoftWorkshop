INVARIANT: gcd(a,b) == gcd(x,y) && 2*a*b == x * v + y * u
TERMINATION: either x or y is decreased in each run of the 
             loop, x and y will always be positive 
             (assumed we start with positive a and b).

RESULT: if x == y then gcd(a,b) == (x+y)/2 == x == y.
        Hence (u+v)/2 == a*b/gcd(a,b), 
        hence (u+v)/2 == lcm(a,b).
