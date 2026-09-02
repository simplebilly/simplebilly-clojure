(ns simple-billy-api.specs.income-statement
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.pn-l-item :refer :all]
            [simple-billy-api.specs.pn-l-item :refer :all]
            )
  (:import (java.io File)))


(def income-statement-data
  {
   (ds/req :expense_items) (s/coll-of pn-l-item-spec)
   (ds/req :net_income) string?
   (ds/req :revenue_items) (s/coll-of pn-l-item-spec)
   (ds/req :total_expenses) string?
   (ds/req :total_revenue) string?
   })

(def income-statement-spec
  (ds/spec
    {:name ::income-statement
     :spec income-statement-data}))
