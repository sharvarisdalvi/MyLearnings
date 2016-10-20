package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileFolderCreationUtils {

	public static File folderCreation(String folderName)
	{
		Date dNow = new Date( );
		SimpleDateFormat ft =  new SimpleDateFormat ("dd-MMM-yyyy");
		//MM/dd/yyyy
		String   date= ft.format(dNow).toString();
		System.out.println(ft.format(dNow));
		String baseFolder=System.getProperty("user.dir")+"\\TestResultScreenShot\\"+folderName;
		System.out.println(baseFolder);
		File bs = new File(baseFolder);
		if (!bs.exists())
		{
			bs.mkdir();
		}
		String subFolder=baseFolder+"\\"+date;
		System.out.println(subFolder);
		File sb= new File(subFolder);
		if(!sb.exists())
		{
			sb.mkdir();
		}
		return sb;
	}
}
