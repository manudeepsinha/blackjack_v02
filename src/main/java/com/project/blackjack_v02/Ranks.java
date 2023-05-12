package com.project.blackjack_v02;
public enum Ranks
{
    A(11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(10),
    Q(10),
    K(10);
	
    private final int value;

    private Ranks(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
	
}