public boolean equals(Date date){
    return (this.getDay() == date.getDay()) &&
           (this.getMonth().equals(date.getMonth())) &&
           (this.getYear() == date.getYear());
}
