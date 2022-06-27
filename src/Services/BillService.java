package Services;

import Response.Response;
import entity.Bill;
import entity.MemberAccount;
import exceptions.CustomException;

public abstract class BillService {
    // fatura işlemleri burada tanımlıdır.

    public abstract Response faturaOdeme(MemberAccount member, Bill bill) throws CustomException;

    public abstract Response faturaSorgulama(Bill bill, String code, String phoneNumber, MemberAccount member);

    public abstract Response faturaSorgulama(Bill bill, int bill_type);

    public abstract Response faturaOdemeIptal(MemberAccount member, Bill bill);
}
