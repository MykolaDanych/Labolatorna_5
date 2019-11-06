package programMenu;

import buildings.Building;
import command.commands.BuildingCommands.ChangeLocationCommand;
import command.commands.BuildingCommands.DeleteApplianceCommand;
import command.commands.BuildingCommands.SearchApplianceCommand;
import command.commands.BuildingCommands.SetLevelCommand;
import command.commands.BuildingCommands.printCommands.*;
import command.commands.BuildingCommands.sortCommands.SortListByApartmentCommand;
import command.commands.BuildingCommands.sortCommands.SortListByConditionCommand;
import command.commands.BuildingCommands.sortCommands.SortListByPowerCommand;
import command.commands.BuildingCommands.sortCommands.SortListByRoomCommand;
import command.commands.Command;
import command.commands.apilianceCommands.ChangeParametersCommand;

import java.util.HashMap;
import java.util.Map;

public class WorkMenu extends Menu{
    static Map<Integer,Command> commandMap;

    static {
        commandMap = new HashMap<>();
        //commandMap.put(1, new )
    }


    public WorkMenu(Building house) {
        super(house);
    }

    public void openMenu() throws Exception{
        int key = 10;
        while(true) {
            System.out.println("1 – Переглянути список приладів\n" +
                    "2 – Відсортувати список приладів\n" +
                    "3 – Вивевести загальну потужність\n" +
                    "4 – Вивести вартість спожитої енергії за певний період часу\n" +
                    "5 – Змінити список приладів\n" +
                    "6 – Пошук приладів за заданими параметрами\n" +
                    "7 - Змінити запобіжник");
            switch (level) {
                case 1: {
                    System.out.println("8 – Переглянути список квартир\n" +
                            "9 – Перейти до квартири");
                    break;
                }
                case 2: {
                    System.out.println("8 – Переглянути список кімнат\n" +
                            "9 – Перейти до кімнати\n" +
                            "10 – Повернутись до будинку");
                    break;
                }
                case 3: {
                    System.out.println("8 – Повернутись до квартири\n" +
                            "9 – Повернутись до будинку");
                    break;
                }
            }
            System.out.println("11 - Вихід");
            key = Integer.parseInt(reader.readLine());
            if (key == 11) break;
            switch (key){
                case 1:{
                    invoker.setCommand(new PrintListCommand(house));
                    invoker.invoke();
                    break;
                }
                case 2:{
                    openSortMenu();
                    break;
                }
                case 3:{
                    invoker.setCommand(new PrintTotalPowerCommand(house));
                    invoker.invoke();
                    break;
                }
                case 4:{
                    double days = 0;
                    System.out.println("Введіть кількість днів:");
                    Double.parseDouble(reader.readLine());
                    invoker.setCommand(new PrinPriceOfEnergyCommand(house,days));
                    invoker.invoke();
                    break;
                }
                case 5:{
                    openChangeMenu();
                    break;
                }
                case 6:{
                    invoker.setCommand(new SearchApplianceCommand(house));
                    invoker.invoke();
                    break;
                }
                case 7:{
                    if(level == 1)
                        invoker.setCommand(new PrintApartmentListCommand(house));
                    else invoker.setCommand(new PrintRoomListCommand(house));
                    invoker.invoke();
                    break;
                }
                case 8:{
                    if(level != 3) {
                        invoker.setCommand(new SetLevelCommand(house, level + 1));
                        level +=1;
                    }
                    else {
                        invoker.setCommand(new SetLevelCommand(house,level-1));
                        level -=1;
                    }
                    invoker.invoke();
                    break;
                }
                case 9:{
                    invoker.setCommand(new SetLevelCommand(house,1));
                    level = 1;
                    invoker.invoke();
                    break;
                }
                default:{

                    break;
                }
            }
        }
    }

    private void openChangeMenu() throws Exception{
        int key = 1;
        System.out.println("1 - Вкл\\Вимк прилад\n" +
                "2 - Змінити характеристики приладу\n" +
                "3 - Додати прилад\n" +
                "4 - Видалити прилад\n" +
                "5 - Перемістити прилад");
        key = Integer.parseInt(reader.readLine());
        switch (key){
            case 1:{
                System.out.println("Список приладів:");
                invoker.setCommand(new PrintListCommand(house));
                invoker.invoke();
                System.out.println("Введіть ід приладу стан якого хочете змінити:");
                key = Integer.parseInt(reader.readLine());
                invoker.setCommand(new DeleteApplianceCommand(house,key));
                break;
            }
            case 2:{
                System.out.println("Список приладів:");
                invoker.setCommand(new PrintListCommand(house));
                invoker.invoke();
                System.out.println("Введіть ід приладу параметри якого хочете змінити:");
                key = Integer.parseInt(reader.readLine());
               // invoker.setCommand(new ChangeParametersCommand(house.getApilianceById(key)));
                break;
            }
            case 3:{
                System.out.println("Список приладів:");
                invoker.setCommand(new PrintListCommand(house));
                invoker.invoke();
                System.out.println("Введіть ід приладу який хочете видалити:");
                key = Integer.parseInt(reader.readLine());
                invoker.setCommand(new DeleteApplianceCommand(house,key));
                break;
            }
            case 4:{
                System.out.println("Список приладів:");
                invoker.setCommand(new PrintListCommand(house));
                invoker.invoke();
                System.out.println("Введіть ід приладу який хочете перемістити:");
                key = Integer.parseInt(reader.readLine());
                invoker.setCommand(new ChangeLocationCommand(house,key));
                break;
            }
            default:{
                break;
            }
        }
    }

    private void openSortMenu() throws Exception {
        int key = 1;
        System.out.println("1 - За станом\n" +
                "2 - За потужнісю");
        switch (level){
            case 1:{
                System.out.println("3 - За квартирами");
                break;
            }
            case 2:{
                System.out.println("3 - За кімнатами");
                break;
            }
            default:{
                break;
            }
        }
        key = Integer.parseInt(reader.readLine());
        switch (key){
            case 1:
                invoker.setCommand(new SortListByConditionCommand(house));
                invoker.invoke();
                break;

            case 2:
                invoker.setCommand(new SortListByPowerCommand(house));
                invoker.invoke();
                break;
            case 3:
                if(level == 1)
                    invoker.setCommand(new SortListByApartmentCommand(house));
                else invoker.setCommand(new SortListByRoomCommand(house));
                invoker.invoke();
                break;

        }
    }

}
