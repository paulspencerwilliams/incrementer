(ns incrementer.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::number
 (fn [db]
   (:number db)))
