package com.tasksprints.auction.domain.auction.exception;

public class AuctionEndedException extends RuntimeException {
    public AuctionEndedException(String message) {
        super(message);
    }
}
