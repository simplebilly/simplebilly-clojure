(ns simple-billy-api.specs.balance-sheet
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.balance-item :refer :all]
            [simple-billy-api.specs.balance-item :refer :all]
            )
  (:import (java.io File)))


(def balance-sheet-data
  {
   (ds/req :assets) (s/coll-of balance-item-spec)
   (ds/req :balanced) boolean?
   (ds/req :equity_liabilities) (s/coll-of balance-item-spec)
   (ds/req :total_assets) string?
   (ds/req :total_equity_liabilities) string?
   })

(def balance-sheet-spec
  (ds/spec
    {:name ::balance-sheet
     :spec balance-sheet-data}))
