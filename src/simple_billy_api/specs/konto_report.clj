(ns simple-billy-api.specs.konto-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.konto-item :refer :all]
            )
  (:import (java.io File)))


(def konto-report-data
  {
   (ds/req :generated_at) string?
   (ds/req :konten) (s/coll-of konto-item-spec)
   (ds/req :period) string?
   })

(def konto-report-spec
  (ds/spec
    {:name ::konto-report
     :spec konto-report-data}))
