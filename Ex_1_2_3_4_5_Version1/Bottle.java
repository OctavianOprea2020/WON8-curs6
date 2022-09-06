import java.util.Scanner;

public class Bottle {
    private int totalCapacity;      // Use milliliters
    private int availableLiquid;    // Use milliliters
    private boolean open;
    private int maxCapacity = 10000; // Maximum Capacity: 10,000 milliliters (= 10 litters)

    public Bottle(int newTotalCapacity, int newAvailableLiquid, boolean newOpen) {
        setTotalCapacity(newTotalCapacity);
        setAvailableLiquid(newAvailableLiquid);
        setOpen(newOpen);

    }
    public int getTotalCapacity() {
        return totalCapacity;
    }
  
    public void setTotalCapacity(int newTotalCapacity) {
        if (newTotalCapacity < 0) {
            System.out.println("Error: trying to set total capacity < 0!");
            return;
        }

        if (newTotalCapacity > getMaxCapacity()) {
            System.out.println("Error: trying to set total capacity > maximum capacity!");
            return;
        }

        totalCapacity = newTotalCapacity;
        System.out.println(String.format("Set total capacity to %d ml.", getTotalCapacity()));
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public void setAvailableLiquid(int newAvailableLiquid) {
        if (newAvailableLiquid < 0) {
            System.out.println("Error: trying to set available liquid < 0!");
            return;
        }

        availableLiquid = newAvailableLiquid;
        System.out.println(String.format("Set available liquid to %d ml.", getAvailableLiquid()));
    }

    public boolean getOpen() {
        return open;
    }
  
    public void setOpen(boolean newOpen) {
        if (open == newOpen) {
            System.out.println(String.format("Bottle is already " + isOpenOrClosed() + "."));
            return;
        }

        open = newOpen;
        System.out.println(String.format("Set open to " + getOpen() + "."));
    }
  
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean hasMoreLiquid() {
        return (availableLiquid > 0 ? true : false);
   }
  
    public boolean isEmpty() {
        return (availableLiquid == 0 ? true : false);
   }
  
    public void openBottle() {
        if (getOpen() == true) {
            System.out.println("There is no need to open the bootle (it's already open)!");
            return;
        }

        setOpen(true);
        System.out.println("Bottle is now open.");
    }
  
    public void closeBottle() {
        if (getOpen() == false) {
            System.out.println("There is no need to close the bootle (it's already closed)!");
            return;
        }
        
        setOpen(false);
        System.out.println("Bottle is now closed.");
    }
  
    public String isOpenOrClosed() {
        return (open ? "open" : "closed");
    }
  
    public void printBottle() {
        System.out.println("Bottle - Verify:");
        System.out.println("Total capacity: " + getTotalCapacity() + " ml.");
        System.out.println("Available liquid: " + getAvailableLiquid() + " ml.");
        System.out.println("Bottle is: " + isOpenOrClosed() + ".");
    }

    public void drinkAmountOfLiquid(int amountOfLiquid) {
        if (amountOfLiquid == 0) {
            System.out.println("Error: the amount of liquid = 0!");
            return;
        }

        if (amountOfLiquid < 0) {
            amountOfLiquid = (-1) * amountOfLiquid; // Set it positive
        }

        if (amountOfLiquid > getTotalCapacity()) {
            System.out.println("Error: the amount of liquid > total capacity!");
            return;
        }

        if (amountOfLiquid > getAvailableLiquid()) {
            System.out.println("Error: the amount of liquid > available liquid!");
            return;
        }

        if (getAvailableLiquid() - amountOfLiquid < 0) {
            System.out.println("Error: the amount of liquid will be < 0!");
            return;
        }

        setAvailableLiquid(getAvailableLiquid() - amountOfLiquid);
        System.out.println(String.format("After drinking the amount of liquid of %d ml, the available liquid is %d ml."
            , amountOfLiquid, getAvailableLiquid()));
    }
  
    public void addAmountOfLiquid(int amountOfLiquid) {
        if (amountOfLiquid < 0) {
            System.out.println("Error: the amount of liquid < 0!");
            return;
        } else if (amountOfLiquid == 0) {
            System.out.println("Error: the amount of liquid = 0!");
            return;
        } else if (amountOfLiquid > getTotalCapacity()) {
            System.out.println("Error: the amount of liquid > total capacity!");
            return;
        }

        if (getAvailableLiquid() + amountOfLiquid > getTotalCapacity()) {
            System.out.println("Error: the amount of liquid will set the volume over the total capacity!");
            return;
        }

        setAvailableLiquid(getAvailableLiquid() + amountOfLiquid);
        System.out.println(String.format("After adding the amount of liquid of %d ml, the available liquid is %d ml."
            , amountOfLiquid, getAvailableLiquid()));
    }
  
    public void drinkOrAddAmountOfLiquid(int amountOfLiquid, boolean bShowErrorMessages) {
        if (amountOfLiquid == 0) {
            if (bShowErrorMessages) {
                System.out.println("Error: amount of liquid = 0!");
            }
            return;
        }

        String action = (amountOfLiquid > 0 ? "add" : "drink");
        int nSign = (amountOfLiquid > 0 ? 1 : -1);
        
        if (nSign * amountOfLiquid > getTotalCapacity()) {
            if (bShowErrorMessages) {
                System.out.println(String.format("Error: trying to %s an amount of liquid of %d ml > total capacity of %d ml!"
                    , action, nSign * amountOfLiquid, getTotalCapacity()));
            }
            return;
        }

        if (amountOfLiquid > 0) { // Add liquid
            if (getAvailableLiquid() + amountOfLiquid > getTotalCapacity()) {
                if (bShowErrorMessages) {
                    System.out.println(String.format("Error: trying to %s an amount of liquid of %d ml that will set the volume over the total capacity of %d ml!"
                        , action, amountOfLiquid, getTotalCapacity()));
                }
                return;
            }
        } else { // Drink/Subtract liquid
            if (getAvailableLiquid() + amountOfLiquid < 0) { // Keep +: will add a negative number i.e. will subtract |number|
                if (bShowErrorMessages) {
                    System.out.println(String.format("Error: trying to %s an amount of liquid of %d ml that will set the volume < 0!"
                        , action, (nSign * amountOfLiquid)));
                }
                return;
            }
        }

        setAvailableLiquid(getAvailableLiquid() + amountOfLiquid); // Keep +: will add a negative number i.e. will subtract |number|
        System.out.println(String.format("After %sing the amount of liquid of %d ml, the available liquid is %d ml."
            , action, Math.abs(amountOfLiquid), getAvailableLiquid()));
    }
  
    public static void main(String[] args) {
        // (1) Use Constructor
        System.out.println("Bottle - After calling Constructor:");
    	Bottle bottle = new Bottle(1000, 500, true);

        System.out.println();
        bottle.printBottle();

        // (2) Use Setter
        System.out.println();
        System.out.println("Bottle - After calling Setter:");
    	bottle.setTotalCapacity(2000); // 2,000 milliliters
    	bottle.setAvailableLiquid(bottle.getTotalCapacity()); // Initial: Available Liquid = Total Capacity (2,000 milliliters)
    	bottle.setOpen(false); // Initial: bottle is closed

        System.out.println();
        bottle.printBottle();

        // Add or Drink liquid
        int liquidVolume = 0;

        do {
            System.out.println();
            System.out.println("Available liquid: " + bottle.getAvailableLiquid() + " ml.");
            System.out.print("Enter the volume of liquid (ml) you want to drink (negative amount) or to add (positive number) (0 for Exit): ");
    
            Scanner scanner = new Scanner(System.in);
            liquidVolume = scanner.nextInt();
    
            System.out.println();

            if (liquidVolume != 0) {
                /*
                if (liquidVolume > 0) {
                    bottle.addAmountOfLiquid(liquidVolume);
                } else {
                    bottle.drinkAmountOfLiquid(liquidVolume);
                }
                */
                if (!bottle.getOpen()) { // Bottle is closed: open it
                    bottle.openBottle();
                }

                bottle.drinkOrAddAmountOfLiquid(liquidVolume, true);
            } else { // 0
                System.out.print("Do you want to exit (Y/N)? ");
                scanner = new Scanner(System.in);
                char continueAction = scanner.next().charAt(0);

                if (continueAction != 'y' && continueAction != 'Y') { // Anything that is not 'y'/'Y' will continue
                    liquidVolume = 1; // Set it a non-zero value to continue
                    System.out.println("Continue...");
                }
            }

        } while (liquidVolume != 0);

        if (bottle.getOpen()) { // Bottle is open: close it
            bottle.closeBottle();
            System.out.println();
        }

        System.out.println("Leaving...");
        System.out.println("Have a nice day!");
	}
}
