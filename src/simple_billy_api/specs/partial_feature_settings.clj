(ns simple-billy-api.specs.partial-feature-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def partial-feature-settings-data
  {
   (ds/opt :onlineshop) boolean?
   (ds/opt :reportBilanz) boolean?
   (ds/opt :reportBwa) boolean?
   (ds/opt :reportEuer) boolean?
   (ds/opt :reportGewerbesteuer) boolean?
   (ds/opt :reportGuv) boolean?
   (ds/opt :reportKst) boolean?
   (ds/opt :reportUstva) boolean?
   })

(def partial-feature-settings-spec
  (ds/spec
    {:name ::partial-feature-settings
     :spec partial-feature-settings-data}))
