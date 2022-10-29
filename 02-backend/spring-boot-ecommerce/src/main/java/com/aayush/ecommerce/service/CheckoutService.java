package com.aayush.ecommerce.service;

import com.aayush.ecommerce.dto.PaymentInfo;
import com.aayush.ecommerce.dto.Purchase;
import com.aayush.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
