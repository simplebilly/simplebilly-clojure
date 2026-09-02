(ns simple-billy-api.specs.bilanz-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.bilanz-item :refer :all]
            [simple-billy-api.specs.bilanz-item :refer :all]
            )
  (:import (java.io File)))


(def bilanz-report-data
  {
   (ds/req :aktiva) (s/coll-of bilanz-item-spec)
   (ds/req :balanced) boolean?
   (ds/req :generated_at) string?
   (ds/req :passiva) (s/coll-of bilanz-item-spec)
   (ds/req :period) string?
   (ds/req :total_aktiva) string?
   (ds/req :total_passiva) string?
   })

(def bilanz-report-spec
  (ds/spec
    {:name ::bilanz-report
     :spec bilanz-report-data}))
