(ns incrementer.views
  (:require [re-frame.core :as re-frame]
            [incrementer.subs :as subs]
            ))

(defn main-panel []
  (let [number (re-frame/subscribe [::subs/number])]
    [:div
     [:div @number]
     [:button {:on-click #(re-frame/dispatch [:increment])} "inc."]]))
