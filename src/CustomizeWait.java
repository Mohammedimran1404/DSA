public class CustomizeWait {
//    int count = 0;
//    boolean value = false;
//	        while (count < 10 && !value) {
//        try {
//            if (element.isDisplayed()) {
//                value = true;
//            }
//        } catch (Exception e) {
//        }
//
//        if (!value) {
//            try {
//                Thread.sleep(3000);
//                System.out.println("wait"+count);
//            } catch (InterruptedException e) {
//
//            }
//        }
//
//        count++;
//    }
//
//	        if (!value) {
//        driver.navigate().refresh();
//    }
//    ----------------------------
//    chat gpt code
//            while (count < maxAttempts) {
//        try {
//            if (element.isDisplayed()) {
//                isDisplayed = true;
//                break;
//            }
//        } catch (Exception e) {
//            System.out.println("Attempt " + count + ": Element not yet visible - " + e.getMessage());
//        }
//
//        try {
//            Thread.sleep(waitTimeInMillis);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt(); // Best practice
//            System.out.println("Thread interrupted during sleep");
//        }
//
//        count++;
//    }
//
//if (!isDisplayed) {
//        System.out.println("Element not displayed after " + maxAttempts + " attempts");
//    }
}
