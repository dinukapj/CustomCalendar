package com.din.customcalendar.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.din.customcalendar.R;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by dinuka on 1/26/18.
 */

public class MonthAdapter extends RecyclerView.Adapter<MonthAdapter.MonthViewHolder> {

    private ArrayList<Calendar> monthsList;
    private LayoutInflater mInflater;
    private Context context;

    @LayoutRes
    public static final int LAYOUT_MONTH = R.layout.month_view_item;

    public MonthAdapter(Context context, ArrayList<Calendar> monthsList) {
        this.monthsList = monthsList;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MonthViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(LAYOUT_MONTH, parent, false);
        MonthViewHolder vh = new MonthViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MonthViewHolder holder, int position) {

        Calendar month = monthsList.get(position);

        int numberOfDaysInMonth = month.getActualMaximum(Calendar.DAY_OF_MONTH);

        //get today's day/month/year
        Calendar calendar = Calendar.getInstance();
        int currentDateDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentDateMonth = calendar.get(Calendar.MONTH);
        int currentDateYear = calendar.get(Calendar.YEAR);

        //append the days to their respective columns in the week

        //iterate over each week
        int totalDayCounter = 1;
        for (int weekCount = 1; weekCount < 7; weekCount++) {

            switch (weekCount) {
                case 1:
                    holder.currentWeekLayout = holder.calendar_week_1;
                    break;
                case 2:
                    holder.currentWeekLayout = holder.calendar_week_2;
                    break;
                case 3:
                    holder.currentWeekLayout = holder.calendar_week_3;
                    break;
                case 4:
                    holder.currentWeekLayout = holder.calendar_week_4;
                    break;
                case 5:
                    holder.currentWeekLayout = holder.calendar_week_5;
                    break;
                case 6:
                    holder.currentWeekLayout = holder.calendar_week_6;
                    break;
            }

            //iterate over each day in the week
            for (int dayInWeek = 1; dayInWeek < 8; dayInWeek++) {

                switch (dayInWeek) {
                    case 1:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_1");
                        break;
                    case 2:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_2");
                        break;
                    case 3:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_3");
                        break;
                    case 4:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_4");
                        break;
                    case 5:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_5");
                        break;
                    case 6:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_6");
                        break;
                    case 7:
                        holder.rlDayParent = holder.currentWeekLayout.findViewWithTag("rlParent_7");
                        break;
                }

                if (totalDayCounter <= numberOfDaysInMonth) {

                    month.set(Calendar.DATE, totalDayCounter);

                    int dayNumberInWeek = month.get(Calendar.DAY_OF_WEEK);

                    holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                    holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");

                    if (dayInWeek == dayNumberInWeek) {
                        
                        holder.tvDay.setText(String.valueOf(totalDayCounter));
                        holder.tvDay.setTextColor(Color.BLACK);
                        holder.rlDayChild.setBackgroundColor(Color.TRANSPARENT);

                        //check if it's today's date
                        if (currentDateMonth == month.get(Calendar.MONTH) && currentDateYear == month.get(Calendar.YEAR) && currentDateDay == month.get(Calendar.DAY_OF_MONTH)) {
                            //set a custom background
                            holder.rlDayChild.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                            holder.tvDay.setTextColor(Color.WHITE);
                        } else {
                            holder.rlDayChild.setBackgroundColor(Color.TRANSPARENT);
                            holder.tvDay.setTextColor(Color.BLACK);
                        }

                        totalDayCounter++;
                    } else {
                        holder.tvDay.setText("");
                        holder.tvDay.setTextColor(Color.TRANSPARENT);
                        holder.rlDayChild.setBackgroundColor(Color.TRANSPARENT);
                    }

                } else {
                    break;
                }
            }
        }
    }

    public class MonthViewHolder extends RecyclerView.ViewHolder {

        public View convertView;

        public LinearLayout calendar_week_titles, calendar_week_1, calendar_week_2, calendar_week_3, calendar_week_4, calendar_week_5, calendar_week_6;

        public LinearLayout rlDayParent = null;
        public RelativeLayout rlDayChild = null;
        public TextView tvDay = null;
        public LinearLayout currentWeekLayout = null;

        public MonthViewHolder(View view) {
            super(view);
            convertView = view;

            calendar_week_titles = view.findViewById(R.id.calendar_week_titles);
            calendar_week_1 = view.findViewById(R.id.calendar_week_1);
            calendar_week_2 = view.findViewById(R.id.calendar_week_2);
            calendar_week_3 = view.findViewById(R.id.calendar_week_3);
            calendar_week_4 = view.findViewById(R.id.calendar_week_4);
            calendar_week_5 = view.findViewById(R.id.calendar_week_5);
            calendar_week_6 = view.findViewById(R.id.calendar_week_6);
        }

    }

    @Override
    public int getItemCount() {
        return monthsList.size();
    }

}