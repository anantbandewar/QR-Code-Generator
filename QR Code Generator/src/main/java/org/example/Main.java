package org.example;

import com.google.zxing.WriterException;
import java.io.IOException;
import static org.example.MyQRCode.createQR;

public class Main {
    public static void main(String[] args) throws WriterException, IOException {
        // Replace @UPI with your actual UPI ID on which you want to receive a payment.
        String data = "upi://pay?pa=@UPI";

        String path = "QRCode.png";
        String charset = "UTF-8";

        createQR(data, path, charset, 200, 200);
        System.out.println("QR Code Generated!!! ");
    }
}