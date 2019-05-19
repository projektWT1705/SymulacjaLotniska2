public class WiezaKontroliLotow
{

    private Lotnisko lotnisko = new Lotnisko();

    public void startSamolotu(Pasazerski pasazerski) throws InterruptedException
    {
        Thread.sleep(3000);

        System.out.println("Samolot pasazerski. Przygotowanie do staru.");
        Thread.sleep(2000);

        if(pasazerski == null)
            System.out.println("Magazyn jest pusty");
        else
        {
            System.out.println("Wybrano samolot z magazynu: " + pasazerski.podajNazwe());
            Thread.sleep(2000);
            System.out.println("Ilosc paliwa w zbiorniku: " + pasazerski.ilePaliwa() + ". Maksymalnie: "
            + pasazerski.podajPojemnoscZbiornika());
            Thread.sleep(2000);

            //sprawdzenie ilosci paliwa
            if(pasazerski.ilePaliwa() < 0.75 * pasazerski.podajPojemnoscZbiornika())
            {
                System.out.println("Zbiornik nie jest zapelniony w 75%. Nalezy zatankowac samolot");
                System.out.println("Tankowanie: ");
                Odliczanie.odliczaj(pasazerski.podajCzasTankowania());
                pasazerski.zatankuj();
            }
            else
            {
                System.out.println("Zbiornika jest zapelniony powyzej 75% a wiec samolot moze odleciec");
            }
            Thread.sleep(2000);


            //sprawdzenie ilosci miejsca na pokladzie
            System.out.println("Ilosc zajetych miejsc: " + pasazerski.pasazerowiePoklad());
            Thread.sleep(1500);
            System.out.println("Mkasymalna ilosc osob w samolocie: " + pasazerski.iloscPasazerowMax());
            Thread.sleep(1000);

            if(pasazerski.pasazerowiePoklad() < 0.5 * pasazerski.iloscPasazerowMax())
            {
                System.out.println("Samolot nie jest zapelniony w 50%. Na poklad musi wejsc wiecej osob");
                System.out.println("Wejscie na poklad osob");
                Odliczanie.odliczaj(pasazerski.podajCzasZaladunku());
            }
            else
                System.out.println("Samolot jest zapleniony w przynajmniej 50% a wiec moze odleciec");
            Thread.sleep(3000);

            System.out.println("Samolot odlatuje: ");
            Odliczanie.odliczaj(4);
            System.out.println("Samolot odlecial!");
            Thread.sleep(2000);
        }
    }




    public void startSamolotu(Towarowy towarowy) throws InterruptedException {

        Thread.sleep(2000);

        System.out.println("Samolot towarowy. Przygotowanie samolotu do staru: ");
        Thread.sleep(2000);

        if(towarowy == null)
            System.out.println("Magazyn jest pusty");
        else
        {
            System.out.println("Wybrano samolot z magazynu: " + towarowy.podajNazwe());
            Thread.sleep(2000);

            System.out.println("Ilosc paliwa w zbiorniku: " + towarowy.ilePaliwa() + ". Maksymalnie: "
                    + towarowy.podajPojemnoscZbiornika());

            Thread.sleep(2000);

            //sprawdzenie ilosci paliwa
            if(towarowy.ilePaliwa() < 0.75 * towarowy.podajPojemnoscZbiornika())
            {
                System.out.println("Zbiornik nie jest zapelniony w 75%. Nalezy zatankowac samolot");
                System.out.println("Tankowanie: ");
                Odliczanie.odliczaj(towarowy.podajCzasTankowania());
                towarowy.zatankuj();
            }
            else
            {
                System.out.println("Zbiornika jest zapelniony powyzej 75% a wiec samolot moze odleciec ");
            }
            Thread.sleep(2000);


            //sprawdzenie ilosci miejsca na pokladzie
            System.out.println("Ilosc zajetego miejsca:  " + towarowy.iloscTowaruPoklad());
            Thread.sleep(1500);
            System.out.println("Mkasymalna ladownosc samolotu " + towarowy.ladownoscMax());
            Thread.sleep(1000);
            if(towarowy.iloscTowaruPoklad() < 0.5 * towarowy.ladownoscMax())
            {
                System.out.println("Samolot nie jest zapelniony w 50%. Na poklad musi zostac zaladowane wiecej towaru");
                System.out.println("Zaladunek towaru:");
                Odliczanie.odliczaj(towarowy.podajCzasZaladunku());
            }
            else
                System.out.println("Samolot jest zapleniony w przynajmniej 50% a wiec moze odleciec");
            Thread.sleep(3000);

            System.out.println("Samolot odlatuje: ");
            Odliczanie.odliczaj(4);
            System.out.println("Samolot odlecial!");
            Thread.sleep(2000);
        }
    }

    public void startSamolotu(Awionetka awionetka) throws InterruptedException {

        Thread.sleep(3000);

        System.out.println("Awionetka. Przygotowanie samolotu do staru: ");
        Thread.sleep(2000);

        if(awionetka == null)
            System.out.println("Magazyn jest pusty");
        else
        {
            System.out.println("Wybrano samolot z magazynu: " + awionetka.podajNazwe());
            Thread.sleep(1500);

            System.out.println("Ilosc paliwa w zbiorniku:  " + awionetka.ilePaliwa() + ". Maksymalnie: "
                    + awionetka.podajPojemnoscZbiornika());
            Thread.sleep(2000);

            //sprawdzenie ilosci paliwa
            if(awionetka.ilePaliwa() < 0.75 * awionetka.podajPojemnoscZbiornika())
            {
                System.out.println("Zbiornik nie jest zapelniony w 75%. Nalezy zatankowac samolot ");
                System.out.println("Tankowanie: ");
                Odliczanie.odliczaj(awionetka.podajCzasTankowania());
                awionetka.zatankuj();
            }
            else
            {
                System.out.println("Zbiornika jest zapelniony powyzej 75% a wiec samolot moze odleciec");
            }
            Thread.sleep(3000);


            //sprawdzenie ilosci miejsca na pokladzie
            System.out.println("Ilosc zajetych miejsc: " + awionetka.pasazerowiePoklad());
            Thread.sleep(1500);
            System.out.println("Mkasymalna ilosc osob w samolocie: " + awionetka.iloscPasazerowMax());
            Thread.sleep(1000);

            if(awionetka.pasazerowiePoklad() < 0.5 * awionetka.iloscPasazerowMax())
            {
                System.out.println("Samolot nie jest zapelniony w 50%. Na poklad musi wejsc wiecej osob ");
                System.out.println("Wejscie na poklad osob");
                Odliczanie.odliczaj(awionetka.podajCzasZaladunku());
            }
            else
                System.out.println("Samolot jest zapleniony w przynajmniej 50% a wiec moze odleciec");
            Thread.sleep(3000);

            System.out.println("Samolot odlatuje: ");
            Odliczanie.odliczaj(4);
            System.out.println("Samolot odlecial!");
            Thread.sleep(2000);
        }
    }

    public static void ladowanieSamolotu()
    {

    }
}