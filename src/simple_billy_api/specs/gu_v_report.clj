(ns simple-billy-api.specs.gu-v-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.gu-v-item :refer :all]
            [simple-billy-api.specs.gu-v-item :refer :all]
            )
  (:import (java.io File)))


(def gu-v-report-data
  {
   (ds/req :expenses) (s/coll-of gu-v-item-spec)
   (ds/req :generated_at) string?
   (ds/req :net_income) string?
   (ds/req :period) string?
   (ds/req :revenue) (s/coll-of gu-v-item-spec)
   (ds/req :total_expenses) string?
   (ds/req :total_revenue) string?
   })

(def gu-v-report-spec
  (ds/spec
    {:name ::gu-v-report
     :spec gu-v-report-data}))
