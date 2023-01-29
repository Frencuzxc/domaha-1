import android.os.Bundle;

import com.example.myfirstapplication.R;

public class buy {
    /**
     * Имеется отличный астрономический телескоп стоимостью 14 000 серебряных
     * монет (далее монет)
     *
     * На счету имеется 1 000 монет и ежемесячно поступает стипендия в размере
     * 2 500 монет из которых все средства можно отложить на телескоп
     *
     * Ваши накопления хранятся в банке под 5 % годовых
     *
     * Необходимо рассчитать, за сколько времени при данных условиях можно
     * накопить на телескоп, ответ необходимо вывести на экран приложения
     */

    private float telescop = 14000; // цена телескопа
    private int account = 1000;  //баланс
    private float stipendy = 2500;  //стипендия
    private int persentntrefe = 100;  //проценты от стипендии
    private float MohPaymentsy = new float(120);

    private float telescopPricewithCountribution(){
        return telescop - account ;
    }

    private float nakoplenia(float amount, int persent)
    {
        return (amount * persent) / 100;
    }

    private int countMonth(float total, float nakoplenia, float bankPersent) {
        float persentPerMonth = bankPersent / 12;
        int count = 0;

        while(total < telescop) {

            total = (total + (total * persentPerMonth) / 100) + nakoplenia;

            if (total < nakoplenia) {
                monthlyPayments[count] = nakoplenia;
            } else {
                montlyPayments[count] = total;
            }
            count++;
        }
        return count;
    }

    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView txt = findViewById(R.id.txt);
    TextView payments = findViewById(R.id.payments);

    int count = countMonth(telescopPricewithCountribution(), nakoplenia(salary, percentFree), percentBank);

    countMonth.setText(count);

    for (int 1 = 0; 1 < count; 1++) {
        }
    payments.setText(String.valueOf(montlyPayments[i]));
    }
}
