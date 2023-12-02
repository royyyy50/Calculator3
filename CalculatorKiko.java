/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class CalculatorKiko {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int Saldo=1000000;
        
        
        while (true){
            String choice= JOptionPane.showInputDialog("Pilihan tindakan :\n1. Cek saldo\n2.Penarikan\n3.setoran\n4. keluar");
            //choice 1
            switch(choice) {
                case "1" -> JOptionPane.showMessageDialog(null, "SALDO ANDA SAAT IN RP", "INFORMATION SALDO",JOptionPane.INFORMATION_MESSAGE);
                case "2" ->                     {
                        String input =JOptionPane.showInputDialog(null,"MASUKAN NILAI YYANG INGIN DITARIK" ,"PENARIKAN",JOptionPane.INFORMATION_MESSAGE );
                        int jumlahPenarikan=Integer.parseInt(input);
                        if (jumlahPenarikan > Saldo){
                            JOptionPane.showMessageDialog(null,"SALDO TIDAK CUKUP", "KESALAHAN",JOptionPane.ERROR_MESSAGE);
                        }else{Saldo = jumlahPenarikan;
                        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL", "INFO PENARIKAN", JOptionPane.PLAIN_MESSAGE);
                        }                          }
                case "3" ->                     {
                        String input = JOptionPane.showInputDialog(null, "MASUKAN NILAI YANG INGIN DISETOR", "SETORAN", JOptionPane.INFORMATION_MESSAGE);
                        int Setoran=Integer.parseInt(input);
                        if (Setoran > 0);
                        Saldo +=Setoran;
                        JOptionPane.showInternalMessageDialog(null, "SETORAN BERHASIL", "SETORAN", JOptionPane.PLAIN_MESSAGE);
                    }
                case "4" -> JOptionPane.showMessageDialog(null, "TERIMAKASIH SUDAH MENGUNAKAN ATM", "BANK KIKOOO",JOptionPane.PLAIN_MESSAGE);
            }
            }
             
                
                
                }
    }
