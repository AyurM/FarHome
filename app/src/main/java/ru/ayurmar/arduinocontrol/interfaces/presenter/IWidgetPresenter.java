package ru.ayurmar.arduinocontrol.interfaces.presenter;


import ru.ayurmar.arduinocontrol.interfaces.view.IWidgetView;
import ru.ayurmar.arduinocontrol.model.FarhomeWidget;

public interface IWidgetPresenter<V extends IWidgetView> extends IBasicPresenter<V>{

    void onChangeDeviceClick();

    void changeDevice(String deviceId);

    void onAboutDeviceClick();

    void renameCurrentDevice(String newName);

//    void onAddWidgetClick();

    void onAddDeviceClick();

    void onRetryToConnectClick();

    void bindDeviceToUser(String deviceSn, String deviceName);

    void onEditWidgetClick(FarhomeWidget widget);

//    void deleteWidget(int position);

    void onSendSmsClick(FarhomeWidget widget);

    void onWidgetValueClick(FarhomeWidget widget);

//    void onDeviceStatusClick();

    int getDeviceCount();

    void resetFirebaseHelper();

//    boolean isDeviceOnline();
}