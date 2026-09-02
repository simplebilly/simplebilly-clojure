(ns simple-billy-api.specs.liquidity-position
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def liquidity-position-data
  {
   (ds/req :accounts_payable) float?
   (ds/req :accounts_receivable) float?
   (ds/req :cash_and_equivalents) float?
   (ds/req :current_ratio) float?
   (ds/req :quick_ratio) float?
   (ds/req :working_capital) float?
   })

(def liquidity-position-spec
  (ds/spec
    {:name ::liquidity-position
     :spec liquidity-position-data}))
