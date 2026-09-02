(ns simple-billy-api.specs.sepa-sequence-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sepa-sequence-type-data
  {
   })

(def sepa-sequence-type-spec
  (ds/spec
    {:name ::sepa-sequence-type
     :spec sepa-sequence-type-data}))
