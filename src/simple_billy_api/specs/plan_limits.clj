(ns simple-billy-api.specs.plan-limits
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plan-limits-data
  {
   (ds/req :maxConnectors) int?
   (ds/req :maxInvoicesPerMonth) int?
   (ds/req :maxUsers) int?
   (ds/opt :metered) (s/map-of string? int?)
   (ds/req :paidConnectors) (s/coll-of string?)
   })

(def plan-limits-spec
  (ds/spec
    {:name ::plan-limits
     :spec plan-limits-data}))
