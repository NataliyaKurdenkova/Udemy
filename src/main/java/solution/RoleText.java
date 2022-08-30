package solution;

//        1) Взять из списка ролей 1ю роль, сформировать строку вида Роль + : + \n
//        result.append(roles[i]+ ":" + "\n");
//        2) Найти строку начинающуюся (startWith) с Роль:,
//        вырезать "Роль:", что осталось пронумеровать и прилепить к результирующей строке
//        [i]+")" + textString + \n
//        3) Искать следующее вхождение роли и повторить п.2
//        4) Если такой роли больше нет, перейти к следующей и повторить п.2 и п.3
//        5) Если больше ролей нет вообще - вернуть то, что получилось


public class RoleText {
    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder sb = new StringBuilder();
        for (String role : roles) {
            sb.append(role + ": \n");
            int num = 1;
            for (String text : textLines) {

                if (text.startsWith(role+":")) {
                    sb.append(text.replaceFirst(role + ":", num + ")") + "\n");
                }
                num++;

            }
            sb.append("\n");
        }
        return String.valueOf(sb);
    }

}
