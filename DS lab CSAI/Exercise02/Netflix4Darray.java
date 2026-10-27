import java.util.Scanner;
class Netflix4Darray {
    //Main method
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //----------YEARS--------------
        System.out.print("Enter Number of Years:");
        int years=sc.nextInt();
        //-----------COUNTRIES-----------
        System.out.print("Enter Number of Countries:");
        int Countries=sc.nextInt();
        //------------GENERES-------------
        System.out.print("Enter Number of Generes:");
        int generes=sc.nextInt();
        //------------MOVIES--------------
        System.out.print("Enter Number of Movies:");
        int movie=sc.nextInt();
        sc.nextLine();
        //-----------4D Array-------------
        String[][][][] movies = new String[years][Countries][generes][movie];

        for(int y=0;y<years;y++){
            System.out.print("\n============Year"+(y+1)+"===========");

            for (int c=0;c<Countries;c++){
                System.out.print("\n Country"+(c+1));

                for (int g=0;g<generes;g++){
                    System.out.print("\n Generes"+(g+1));

                    for (int m=0;m<movie;m++){
                        System.out.print("\n Enter Movie"+(m+1)+":");
                        movies[y][c][g][m]=sc.nextLine();
                    }
                }
            }
        }
        //Display data i rows and columns
        System.out.print("\n\n =========NETFLIX MOVIES========");
        for(int y=0;y<years;y++){
            System.out.print("\n\nYear"+(y+1));
            for(int c=0;c<Countries;c++){
                System.out.print("\nCountries"+(c+1));
                //header
                System.out.print("\n");
                System.out.print("Generes\t\t");
                for(int m=0;m<movie;m++){
                    System.out.print("Movie"+(m+1) +"\t");
                }
                System.out.println();
                //Rows and Columns
                for(int g=0;g<generes;g++){
                    //row name
                    System.out.print("Genre"+(g+1)+"\t\t");
                    //column Values
                    for (int m=0;m<movie;m++){
                        System.out.print(movies[y][c][g][m]+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        sc.close();
    } 
}