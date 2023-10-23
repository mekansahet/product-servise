package com.eleiatech.stockmanagement.productservise.exception.enums;

public enum FriendlyMessageCode implements IFriendlyMessageCode {
    OK(1000);
    private final int value; // buarad enum tanımlamamızı yapmaızı istiyor

    FriendlyMessageCode(int value){this.value=value;}
    @Override
    public int getFriendlyMessageCode() {
        return value;
    }
}
