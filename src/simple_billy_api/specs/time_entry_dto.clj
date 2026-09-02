(ns simple-billy-api.specs.time-entry-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def time-entry-dto-data
  {
   (ds/opt :clock_in) inst?
   (ds/opt :clock_out) inst?
   (ds/req :created_at) inst?
   (ds/req :date) inst?
   (ds/req :employee_id) uuid?
   (ds/opt :hours) string?
   (ds/opt :notes) string?
   (ds/req :time_entry_id) uuid?
   })

(def time-entry-dto-spec
  (ds/spec
    {:name ::time-entry-dto
     :spec time-entry-dto-data}))
