package net.sourceforge.simcpux;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppRegister extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		final IWXAPI msgApi = WXAPIFactory.createWXAPI(context, null);

		//// 将该app注册到微信
		msgApi.registerApp(Constants.APP_ID);
	}
}
