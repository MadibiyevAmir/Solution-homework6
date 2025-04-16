package handler;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("refund_request".equals(issue) || "billing_issue".equals(issue)) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[JuniorSupport] Forwarding issue to next handler...");
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue);
        }
    }
}
