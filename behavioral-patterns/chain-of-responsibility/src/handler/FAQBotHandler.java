package handler;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("password_reset".equals(issue)) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Forwarding issue to next handler...");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue);
        }
    }
}
