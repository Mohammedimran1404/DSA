package Enums;

public enum EnumsPractice {
        SUCCESS(200), ERROR(500), PENDING(102);

        private int code; // field

    EnumsPractice(int code) {   // constructor
            this.code = code;
        }

        public int getCode() {  // method
            return code;
        }
    }


