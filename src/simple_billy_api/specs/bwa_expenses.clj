(ns simple-billy-api.specs.bwa-expenses
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.expense-item :refer :all]
            )
  (:import (java.io File)))


(def bwa-expenses-data
  {
   (ds/req :expense_breakdown) (s/coll-of expense-item-spec)
   (ds/req :total_expenses) string?
   })

(def bwa-expenses-spec
  (ds/spec
    {:name ::bwa-expenses
     :spec bwa-expenses-data}))
