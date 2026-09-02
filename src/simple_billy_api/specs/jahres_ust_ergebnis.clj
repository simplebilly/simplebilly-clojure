(ns simple-billy-api.specs.jahres-ust-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def jahres-ust-ergebnis-data
  {
   (ds/req :bis) string?
   (ds/req :gespeicherte_perioden) int?
   (ds/req :hat_ig_transaktionen) boolean?
   (ds/req :ist_kleinunternehmer) boolean?
   (ds/req :jahr) int?
   (ds/req :kz_41) string?
   (ds/req :kz_43) string?
   (ds/req :kz_46) string?
   (ds/req :kz_47) string?
   (ds/req :kz_48) string?
   (ds/req :kz_61) string?
   (ds/req :kz_66) string?
   (ds/req :kz_67) string?
   (ds/req :kz_81) string?
   (ds/req :kz_83) string?
   (ds/req :kz_84) string?
   (ds/req :kz_85) string?
   (ds/req :kz_86) string?
   (ds/req :kz_88) string?
   (ds/req :kz_89) string?
   (ds/req :kz_93) string?
   (ds/req :restschuld) string?
   (ds/req :summe_vorauszahlungen) string?
   (ds/req :von) string?
   (ds/req :zahllast) string?
   })

(def jahres-ust-ergebnis-spec
  (ds/spec
    {:name ::jahres-ust-ergebnis
     :spec jahres-ust-ergebnis-data}))
