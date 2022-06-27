package Services;

import Response.Response;
import entity.Bill;
import entity.MemberAccount;
import exceptions.CustomException;

import java.util.Date;

public class Client extends BillService{
    @Override
    public Response faturaOdeme(MemberAccount member, Bill bill) throws CustomException {
        Response response = new Response();
        Date date = new Date();


        if (member.getBalance() >= bill.getAmount()) {
            response.setCode("0");
            response.setDate(date.toString());

        } else {
            response.setCode("1");
            response.setDate(date.toString());
            throw new CustomException("yetersiz bakiye"); //faturamız hesabımızdaki paradan fazla ise burdaki hata kodu çalışır.


        }
        return response;


    }

    @Override
    public Response faturaSorgulama(Bill bill, String code, String phoneNumber, MemberAccount member) {


        return new Response();
    }

    @Override
    public Response faturaSorgulama(Bill bill, int bill_type) {

        return new Response();
    }

    @Override
    public Response faturaOdemeIptal(MemberAccount member, Bill bill) {

        return new Response();
    }
}
