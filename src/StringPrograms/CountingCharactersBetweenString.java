package StringPrograms;

public class CountingCharactersBetweenString {
    public static void main(String[] args) {
                String str = "Automation1234testing";
                StringBuffer stringBuffer = new StringBuffer();
                int i = 0;
                while (i < str.length()) {
                    char ch = str.charAt(i);

                    if (ch>='A'&& ch<='Z') {
                        stringBuffer.append(Character.toLowerCase(ch));
                        i++;
                    }
                    else if (ch>='0'&&ch<='9') {
                        int sum = 0;
                        while (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                            sum += str.charAt(i) - '0';
                            i++;
                        }
                        stringBuffer.append(sum);
                    }
                    else {
                        stringBuffer.append(ch);
                        i++;
                    }
                }

                System.out.println(stringBuffer);
            }
        }
