public static boolean estimateInBounds(double actual, 
                                       double nominal) {
    
...
    if (nominal < 5 || nominal > 10000) {
        throw new IllegalArgumentException();
    } else {
        return   
            (absShortFall <= 0                        ||
            (5 < nominal    && nominal <= 50   
                            && relShortFall <= 0.09)  ||
             ...) ;

    }
}
