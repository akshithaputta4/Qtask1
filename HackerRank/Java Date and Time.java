class Result {
    public static String findDay(int month, int day, int year) {
        Calendar c=Calendar.getInstance();
        c.set(year,month-1,day);
        int i=c.get(c.DAY_OF_WEEK);
        String[] s={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    return s[i-1];
}
}

