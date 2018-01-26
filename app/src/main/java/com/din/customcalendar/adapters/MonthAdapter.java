package com.din.customcalendar.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
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

        Calendar month = monthsList.get(position - 1);

        int numberOfDaysInMonth = month.getActualMaximum(Calendar.DAY_OF_MONTH);

        //get today's day/month/year
        Calendar calendar = Calendar.getInstance();
        int currentDateDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentDateMonth = calendar.get(Calendar.MONTH);
        int currentDateYear = calendar.get(Calendar.YEAR);

        //append the days to their respective columns in the week
        int dayCounter = 1;
        for (int weekCount = 1; weekCount < holder.weeks.length; weekCount++) {

            for (int positionInLayout = 1; positionInLayout < 8; positionInLayout++) {

                if (dayCounter <= numberOfDaysInMonth) {

                    month.set(Calendar.DATE, dayCounter);

                    int dayOfTheIter = month.get(Calendar.DAY_OF_WEEK);

                    switch (dayCounter) {
                        //region week 1
                        case 1:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 2:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 3:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 4:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 5:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 6:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 7:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                        //region week 2
                        case 8:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 9:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 10:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 11:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 12:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 13:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 14:
                            holder.rlDayParent = holder.calendar_week_1.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                        //region week 3
                        case 15:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 16:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 17:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 18:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 19:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 20:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 21:
                            holder.rlDayParent = holder.calendar_week_3.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                        //region week 4
                        case 22:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 23:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 24:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 25:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 26:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 27:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 28:
                            holder.rlDayParent = holder.calendar_week_4.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                        //region week 5
                        case 29:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 30:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 31:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 32:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 33:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 34:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 35:
                            holder.rlDayParent = holder.calendar_week_5.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                        //region week 6
                        case 36:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_1");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 37:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_2");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 38:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_3");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 39:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_4");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 40:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_5");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 41:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_6");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        case 42:
                            holder.rlDayParent = holder.calendar_week_6.findViewWithTag("rlParent_7");
                            holder.rlDayChild = holder.rlDayParent.findViewWithTag("rlDayChild");
                            holder.tvDay = holder.rlDayChild.findViewWithTag("tvDay");
                            break;
                        //endregion
                    }

                    if (holder.tvDay != null && holder.rlDayChild != null) {
                        if (positionInLayout == dayOfTheIter) {

                            holder.tvDay.setText(String.valueOf(dayCounter));
                            holder.tvDay.setTextColor(Color.BLACK);
                            holder.rlDayChild.setBackgroundColor(Color.TRANSPARENT);

                            //check if it's today's date
                            if (currentDateMonth == month.get(Calendar.MONTH) && currentDateYear == month.get(Calendar.YEAR) && currentDateDay == month.get(Calendar.DAY_OF_MONTH)) {
                                //set a custom background
                                holder.rlDayChild.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
                                holder.tvDay.setTextColor(Color.WHITE);
                            }

                            dayCounter++;
                        } else {
                            //if there's no matches, clear out the cell
                            holder.tvDay.setText("");
                            holder.tvDay.setTextColor(Color.TRANSPARENT);
                            holder.rlDayChild.setBackgroundColor(Color.TRANSPARENT);

                            //if the iteration is at its last element, proceed to next day
                            if (positionInLayout == 7) {
                                dayCounter++;
                            }
                        }
                    } else {
                        dayCounter++;
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
        public LinearLayout[] weeks;
        public RelativeLayout[] days;
        public RelativeLayout[] dayChildrenViews;
        public TextView[] daysText;

        public LinearLayout rlDayParent = null;
        public RelativeLayout rlDayChild = null;
        public TextView tvDay = null;

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

            weeks = new LinearLayout[7];
            days = new RelativeLayout[6 * 7];
            daysText = new TextView[6 * 7];
            dayChildrenViews = new RelativeLayout[6 * 7];

            weeks[0] = calendar_week_titles;
            weeks[1] = calendar_week_1;
            weeks[2] = calendar_week_2;
            weeks[3] = calendar_week_3;
            weeks[4] = calendar_week_4;
            weeks[5] = calendar_week_5;
            weeks[6] = calendar_week_6;
        }

    }

    @Override
    public int getItemCount() {
        return monthsList.size();
    }

}