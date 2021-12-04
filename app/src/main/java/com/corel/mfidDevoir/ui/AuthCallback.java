package com.corel.mfidDevoir.ui;

public interface AuthCallback {
    void sendMessage(String phoneNumber);
    void verification(String code);
}
