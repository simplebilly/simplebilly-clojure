(ns simple-billy-api.specs.bwa-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.bwa-expenses :refer :all]
            [simple-billy-api.specs.bwa-revenue :refer :all]
            [simple-billy-api.specs.bwa-summary :refer :all]
            )
  (:import (java.io File)))


(def bwa-report-data
  {
   (ds/req :expenses) bwa-expenses-spec
   (ds/req :generated_at) string?
   (ds/req :period) string?
   (ds/req :revenue) bwa-revenue-spec
   (ds/req :summary) bwa-summary-spec
   })

(def bwa-report-spec
  (ds/spec
    {:name ::bwa-report
     :spec bwa-report-data}))
