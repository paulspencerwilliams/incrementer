(ns incrementer.events
  (:require [re-frame.core :as re-frame]
            [incrementer.db :as db]))

(re-frame/reg-event-db
 ::initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
  :increment
  []
  (fn [db]
    (update db :number inc)))