package com.udacity.stockhawk.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

import com.udacity.stockhawk.R;
import com.udacity.stockhawk.ui.MainActivity;

public class QuoteWidgetProvider extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            // Set up the layout for the widget.
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.quote_appwidget);

            // Launch MainActivity when the widget is clicked.
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            views.setOnClickPendingIntent(R.id.widget_layout, pendingIntent);

            // Update this app widget through the AppWidgetManager.
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
