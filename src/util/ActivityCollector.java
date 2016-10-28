package util;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

/**
 * 用于管理所有活动
 * 
 * @author Blank
 *
 */
public class ActivityCollector {
	public static List<Activity> activities = new ArrayList<Activity>();

	public static void addActivity(Activity activity) {
		activities.add(activity);
	}

	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	/**
	 * 退出整个应用
	 */
	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}

		}
	}
}
