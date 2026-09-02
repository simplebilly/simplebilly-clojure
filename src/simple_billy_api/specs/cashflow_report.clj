(ns simple-billy-api.specs.cashflow-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cashflow-report-data
  {
   (ds/req :closing_balance) float?
   (ds/req :financing_cashflow) float?
   (ds/req :investing_cashflow) float?
   (ds/req :net_cashflow) float?
   (ds/req :opening_balance) float?
   (ds/req :operating_cashflow) float?
   (ds/req :period) string?
   })

(def cashflow-report-spec
  (ds/spec
    {:name ::cashflow-report
     :spec cashflow-report-data}))
