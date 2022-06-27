import Response.Response;
import Services.Client;
import entity.Bill;
import entity.MemberAccount;
import exceptions.CustomException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MemberAccount member = new MemberAccount("Mustafa", "Sahin", 44, 1000, "5354588101");
        Bill bill = new Bill(110, 1, "04-07-2022");
        Response response;

        Scanner data = new Scanner(System.in);
        System.out.println("Lütfen membercode giriniz");
        String code = data.nextLine();

        if (code.equals(member.getCode())) { //kullanıcının girdiği code kontrol edilir.
            System.out.println("Hoş geldiniz " + member.getName() + " " + member.getSurName());
            System.out.println("hesap bakiyeniz : " + member.getBalance());
            System.out.println("Lütfen fatura tipini seçiniz : \n 1.telefon  \n 2.internet \n 3.su ");
            int selection = data.nextInt();
            switch (selection) { //fatura tipi seçilir.
                case 1:
                    if (bill.getBill_type() == 1) {
                        System.out.println("Telefon faturası miktarı : " + bill.getAmount() + " Fatura tarihi : " + bill.getProcess_date());
                        System.out.println("ödemek için 1'e basın");
                        int statement = data.nextInt();
                        if (statement == 1) {
                            Client client = new Client();
                            try {
                                response = client.faturaOdeme(member, bill);

                                if (response.getCode().equals("0")) {
                                    System.out.println("işlem başarılı. İşlem tarihi :" + response.getDate());
                                } else {
                                    System.out.println("işlem başarısız");
                                }
                            } catch (CustomException exception) {
                                System.out.println(exception.getMessage());
                                System.out.println("işlem başarısız");
                            }
                        } else {
                            System.out.println("yanlış bir seçim yaptınız");
                        }

                    } else {
                        System.out.println("Telefon faturanız bulunmamaktadır");
                    }
                    break;
                case 2:
                    if (bill.getBill_type() == 2) {
                        System.out.println("İnternet faturası miktarı : " + bill.getAmount() + " Fatura tarihi : " + bill.getProcess_date());
                        System.out.println("ödemek için 1'e basın");
                        int statement = data.nextInt();
                        if (statement == 1) {
                            Client client = new Client();
                            try {
                                response = client.faturaOdeme(member, bill);

                                if (response.getCode().equals("0")) {
                                    System.out.println("işlem başarılı. İşlem tarihi :" + response.getDate());
                                } else {
                                    System.out.println("işlem başarısız");
                                }
                            } catch (CustomException exception) {
                                System.out.println(exception.getMessage());
                                System.out.println("işlem başarısız");
                            }
                        } else {
                            System.out.println("yanlış bir seçim yaptınız");
                        }

                    } else {
                        System.out.println("İnternet faturanız bulunmamaktadır");
                    }
                    break;
                case 3:
                    if (bill.getBill_type() == 3) {
                        System.out.println("Su faturası miktarı : " + bill.getAmount() + " Fatura tarihi : " + bill.getProcess_date());
                        System.out.println("ödemek için 1'e basın");
                        int statement = data.nextInt();
                        if (statement == 1) {
                            Client client = new Client();
                            try {
                                response = client.faturaOdeme(member, bill);

                                if (response.getCode().equals("0")) {
                                    System.out.println("işlem başarılı. İşlem tarihi :" + response.getDate());
                                } else {
                                    System.out.println("işlem başarısız");
                                }
                            } catch (CustomException exception) {
                                System.out.println(exception.getMessage());
                                System.out.println("işlem başarısız");
                            }
                        } else {
                            System.out.println("yanlış bir seçim yaptınız");
                        }

                    } else {
                        System.out.println("Su faturanız bulunmamaktadır");
                    }
                    break;


            }


        }else{
            System.out.println("bilgileriniz hatalı ");
        }
    }
}
